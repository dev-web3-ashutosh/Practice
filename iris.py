import pandas as pd
from sklearn.model_selection import train_test_split
from matplotlib import pyplot as plt
from numpy import array

names = ["sepal-length", "sepal-width", "petal-length", "petal-width", "species"] 
data=pd.read_csv("https://raw.githubusercontent.com/jbrownlee/Datasets/master/iris.csv", names=names)

'''
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
'''

# Visualisations

# 1. Box and Whisker
'''
data.plot(kind='box', subplots=True, layout=(2,2), sharex=False, sharey=False)
plt.show()
'''

# 2. Histogram
data.hist()

# scatterplot; interactions between attributes (multivariate)
'''
scatter_matrix(dataset)
plt.show()
'''

# define input and output variables x and y
array=array(dataset)
x=array[:,:-1]
y=array[:,-1]

# split the data
x_train, x_test, y_train, y_test=train_test_split(x,y,test_size=0.2, random_state=1)

'''
# create models
models=[]

models.append(('LR', LogisticRegression(solver='liblinear', multi_class='ovr')))
models.append(('LDA', LinearDiscriminantAnalysis()))
models.append(('KNN', KNeighborsClassifier()))
models.append(('CART', DecisionTreeClassifier()))
models.append(('NB', GaussianNB()))
models.append(('SVM', SVC(gamma='auto')))
'''





plt.show()


