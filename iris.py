import pandas as pd
names = ["sepal-length", "sepal-width", "petal-length", "petal-width", "species"] 
data=pd.read_csv("https://raw.githubusercontent.com/jbrownlee/Datasets/master/iris.csv", names=names)
data.info()
print(data.head())
data.shape
data.describe()
