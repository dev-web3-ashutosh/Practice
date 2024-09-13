import pandas as pd
names = ["sepal-length", "sepal-width", "petal-length", "petal-width", "species"] 
data=pd.read_csv("https://raw.githubusercontent.com/jbrownlee/Datasets/master/iris.csv", names=names)
print("Info")
data.info()
print("Head")
print(data.head())
print("Shape")
data.shape()
print("Des")
print(data.describe())
