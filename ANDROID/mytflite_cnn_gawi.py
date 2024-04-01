
import tensorflow as tf
from tensorflow import keras
import numpy as np

# 가위   0 [1,0,0] --> 보 2
# 바위   1 [0,1,0] --> 가위 0
# 보    0 [0,0,1] --> 바위 1

x_train_a = [
    [1,0,0],
    [0,1,0],
    [0,0,1]
]
y_train_a = [
    2,0,1
]


x_train = np.array(x_train_a,dtype=np.float16)
x_train = np.reshape(x_train,(-1,3))

y_train = np.array(y_train_a) 



model = keras.Sequential([
    keras.layers.Flatten(input_shape=(3,1)),
    keras.layers.Dense(512, activation                                                                                                                              =tf.nn.relu),
    keras.layers.Dense(512, activation=tf.nn.relu),
    keras.layers.Dense(3)
])



model.compile(optimizer='adam',
              loss=tf.keras.losses.SparseCategoricalCrossentropy(from_logits=True),
              metrics=['accuracy'])

model.fit(x_train, y_train, epochs=50)


predictions = model.predict(x_train)


converter = tf.lite.TFLiteConverter.from_keras_model(model)
tflite_model = converter.convert()

f = open('gawi.tflite', "wb")
f.write(tflite_model)
f.close()





