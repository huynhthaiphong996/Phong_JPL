# Object oriented programming  
## 1. Represent the real world  
<img src = "http://i.imgur.com/gKXPchZ.png">  

## 2. Objects group together
- **Primitives** (int, double, char, etc..)  
- **Objects** (String, etc..)  
<img src ="http://i.imgur.com/LcR7yVS.png">  

# Defining classes  

* Class names are Capitalized
* 1 Class = 1 file
* Having a **main** method means the class can be run
### a/Constructors  
* Constructor name == the class name  
* No return type  - never returns anything  
* Usually initialize fields  
* All classes need at least one constructor - If you don't write one, defaults to  
**CLASSNAME** **()** {  
}  
ex:  
<img src ="http://i.imgur.com/hFjmkCV.png">  
  
  
# Using Classes    

### a/ Accessing fields  
Object.**FIELDNAME**  
ex:  
<img src = "http://i.imgur.com/yjiej4K.png">  
### b/ Calling Methods  
Object.**METHODNAME**([Arguments])  
ex:  
<img src = "http://i.imgur.com/CmKNIvK.png">  
# References - Values  
- **Primitive** types are basic java types  

<ul>
  <li>int, long, char, double, boolean, byte, float</li>
  <li>The actual **values** are stored in  the variable</li>
</ul>  

- **References** types are arrays and objects  
 String, int[], Baby, ...  
 
 # Static types and methods  
 * Applies to fields and methods  
 * Means the field/method : is **defined for the class declaration**, is **not** unique for each instance.  
 