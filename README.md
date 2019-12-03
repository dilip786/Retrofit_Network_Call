#### Retrofit - GoogleNearBy Places,MVP Architecture

The main purpose of this app is retrieving nearby places (Using Google Place API) using Retrofit for doing HTTP request & GSON lib for parsing.


<p align="left">
  <img src="https://user-images.githubusercontent.com/10658016/66260067-413ccf80-e7d7-11e9-9363-9a1e7e0f0370.gif?raw=true" alt="Home Page" width="300"/>
</p>

#### Dependencies

```
def retrofit_version = "2.6.2";

implementation "com.squareup.retrofit2:retrofit:$retrofit_version"
implementation "com.squareup.retrofit2:converter-gson:$retrofit_version"
   
```

#### Android MVP Architecture 

<p align="left">
  <img src="https://user-images.githubusercontent.com/10658016/66260242-ac87a100-e7d9-11e9-8548-020ab1255db9.png?raw=true" alt="Home Page" width="500"/>
</p>

* Model: This handles the data part of our application
* Presenter: It acts as a bridge that connects a Model and a View.
* View: This is responsible for laying out views with the relevant data as instructed by the Presenter

#### Key Points about MVP Pattern

* Activity, Fragment and a CustomView act as the View part of the application.
* The Presenter is responsible for listening to user interactions (on the View) and model updates (database, APIs) as well as   updating the Model and the View.
* Interfaces need to be defined and implemented to communicate between View-Presenter and Presenter-Model.
* The View and Model classes can’t have a reference of one another.

