# Hotel-Information-System-1بسم الله الرحمن الرحيم 
في مشروعنا اليوم فهو يتحدث عن نظام معلومات الفنادق 
في البداية سنعرف المعلومات التي ستظهر في البرنامج او ما تسمى بالمخرجات 
سيتمكن مستخدم البرنامج من اضافة زبائن وسيجل البيانت التالية 
ID , name , age , address , mobile number , email , type of rome 
وايضا بالامكان استعراض هذه البيانت لكل الزبائن 
والان انتقالا الى الاكواد فقد تمت انشاء 5 كلاسات موجودة في المشروع وهي كالتالي
Class Human , Class Customer , interface CustomerType , Class InvalidAgeException , Class Hotel 
1- Class Human : 
وهو الكلاس الاساسي في البرنامج  ويحتوي على بيانات بشرية  
name , age ,address, mobileNumber , email 
وهي من نوع 
privat 
ويحتوي ايضا على constructor وعلى Set and Get 
بحكم كون البيانات private 
بالبنسة ل set age 
فهي تحوي على استدعاء لدالة  Exception  
بحيث يصبح عمر الزبون القادم للحجز هو  من 18 سنة فما فوق 
وايضا يوجد toString لطباعة بيانات Human 
2- Class Customer : 
فهذا الكلاس  extends Human  وايضا implements CustomerType 
سيرث هذا الكلاس كلاس human بالاضافة الى ID and Type 
ويحتوي ايضا على constructor 
وتم استخدام Super للاستدعاء 
ويحتوي على public String CustomerType 
الذي بوظيفته يقسم الزبون الى اثنين اما يحجز royal او one bed room  
a= Royal b= one bed room , else = There are two types of room only 
وهذه الميثود هي implements ل public String  CustomerType
وتحتوي tostring للطباعة 
3- interface CustomerType: 
 use for declleration of public String CustomerType method 
 4- Class InvalidAgeException  extends Exception
 من خلاله يتم استدعاء Exception للميثود الموجود في كلاس Human  
 وبهدفها تظهر رسالة الخطأ عند إدخال عمر غير صالح 
 5- Class Hotel 
 لاضافة زبون جديد واياضا لطباعة معلومات الزبون في الفندق وخروج 
 
 
