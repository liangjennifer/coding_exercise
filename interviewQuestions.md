# Interview Question

## eBay

**1. What is Autoboxing?**

**2. What is implicit cast and explicit cast ?**

**3. What is throws vs. throw and when/why do you use each?**

**4. What are the different processors in JMeter?**

**5. What is Thread Group and Sampler  in JMeter?**

**6. What is Abstract class and Interface, when do you use either?**

**7. what do you need to overwrite to compare if 2 objects are equal?**

**8. When do you use comparitor ?  and why?  and how do you do it?**

**9. ArrayList vs LinkedList.  When do you use each?  And why is it better to use ArrayList when doing lots of read?**

**10. How do you make sure LinkedList is thread safe?**

**11. Is HashSet thread safe?  what happens when you try to modify it ?  How do you make sure it's thread safe ? (answer : use ConcurrentHashSet)**

**12. StringPool**

**13. Hashtable vs HashMap vs LinkedHashMap vs TreeMap.  How are they different and when do you use which.**


**14. SQL Question : given an employee table, write sql query to return the 2nd highest salary**


## Workday
Coding Exercise

**1. Write a method to validate JSON response**

**2. Write a method to validate JSON response ignoring time**

**3. Write a method to extract value out of json response. For example: get_value("sleep_time") or get_value("trending.style.time")**

**4. write a function to transform data**

## AWS Round 1

**1. Q: Write a function which can parse the following text into your own data structure
example 1<br>
{<br>
   k1 : v1<br>
   k2 : {<br>
       sk1 : sv1<br>
   }<br>
}<br>

example 2<br>
{<br>
    k1: v1<br>
    k2 : {<br>
        sk1 : {<br>
                <br>
        }<br>
    }<br>
}<br>



public Object parse(String[] arr) {<br>
    Stack stk = new Stack();<br>
    Map root = new HashMap();<br>
    for (int i = 0; i < arr.length; i++) {<br>
        s = arr[i];<br>
        if (s.length() > 0 && s.indexOf("{") < 0) {<br>
            String[] token = s.split(":");<br>
            root.add(token[0], token[1]);<br>
        } else if (s.indexOf("{") > 0) {<br>
            String[] token = s.split(":");<br>
            ArrayList subArray = new ArrayList();<br>
            <br>
            String nextLine = arr[++i];<br>
            while (nextLine.indexOf("}") < 0) {<br>
                subArray.add(nextLine);<br>
                nextLine=arr[++i];<br>
            }<br>
            root.add(token[0], prase(subArray));<br>
        }<br>
    }<br>
}<br>

**2. write a function that will compare 2 version numbers in String type.  for example: 1.3 vs 1.2.3



## AWS Round 2
**1. Q: Given a dictionary input {employee, manager}, write a data structure to store the data, and a function to print out the direct report. 
Input example: <br>
{"A", "C"},<br>
{"B", "C"},<br>
{"E", "G"},<br>
{"C", "F"},<br>
{"G", "F"},<br>
{"F", "F"}<br>
Output exmaple:<br>
A - []<br>
B - []<br>
C - [A, B]<br>
G - [E]<br>
F - [A,B,C,E,G]<br>



