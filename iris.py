import pandas as pd
from sklearn.model_selection import train_test_split
names = ["sepal-length", "sepal-width", "petal-length", "petal-width", "species"] 
data=pd.read_csv("https://raw.githubusercontent.com/jbrownlee/Datasets/master/iris.csv", names=names)
print("Info")
data.info()
print("Head")
print(data.head())
print("Shape")
print(data.shape)
print("Des")
print(data.describe())
print("GrpBy")
print(data.groupby("species").size())
