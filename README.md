# Hello-world
## Very Good
This is a test

1.基本数据类型 —— int
           int用来表示一个整数，取值范围在-2^31—2^31-1,计算结果是：-2147483648—2147
2.关键字，是Java语法的保留字，不能用来做名字（例：public class static void int）                       
3.标示符，（1.由大小写 英文 字符 数字 和 下划线 组成的，区分大小写的，不以数字开头的文字。）
         （2.可以用作Java中的各种东西的名字，比如类名 方法名等。）
         （3.标示符是区分大小写的。）
4.变量
5.深探加减乘除的程序
          （1.一行代码没有分号叫表达式，一个表达式为一个基本单元。）
          （2.一行代码后面有分号就是表达式的结束，即为一个语句。）
          （3.表达式中的组合和嵌套，可以包含在同一个语句中。）
          （4.大括号内零个或者多个语句，就是代码块。）
6.Java是区分大小的
           (1.关键字，标示符）
          （2.类名与文件名一致，包括大小写要求）
          （3.使用变量，名字与声明变量的标示符大小写一致）
          （4.方法名区分大小写）
          （5.类型也区分大小写，int是数据类型，Int则不是）
          （6.System.out.printlm可以被Java认识，System.Out.Printlm就不可以）
          （7.整数的字面值类型默认是int）
7.十进制  0~9    二进制 0~1    十六制 0~F
           (一个二进制的位叫做一个bit，网络宽带中的单位，都是bit）
          （八个二进制的位，组成一个byte，硬盘等存储的单位，都是byte）
          （byte是计算机中基本的衡量存储的单位，bit不会作为划分存储单位）
8.数字的基本数据类型
          （整数类型）
                    byte 占 1个byte 值域 -128~127
                    short占  2个byte 值域 -32768~32767
                    int  占  4个byte 值域 -2147483648~2147483647
                             java中整数缺省是int类型
                    log  占  8个byte 值域 -9223372036854774808~9223372036854774807
          （浮点（小数）类型）
                    float占  4个byte 值域 ±340282346638528859811704183484516925440
                    double精度是float的两倍，占8个byte 
                             java中的浮点数缺省是double类型
          （符号位）
9.布尔和字符数据类型
           boolean占1个byte，值域是true false
           char   占2个byte，值域是所有字符
10.java中的运算符
           #除赋值运算符外，运算符本身不会更改变量的值
           1.取模运算符：%
             用来计算余数，负数可以被取模或取模，小数也可以取模。
                       int r = a % b ，当a<b时，结果为a,
                              当a>b时，结果为a/b的余数
                                                    当a=b或者a能被b整除，结果为0
           2.比较运算符
             >     >=     <    <=    !=    ==
           3.布尔运算符
                       ！叫做非运算符，not运算符
                             ！true是false ，！false是true
                       & 叫做且运算符，and运算符（有一个false，结果就是false）
                             ！true&true是true，true&false是false
                       &&叫做且且运算符，andand运算符
                               运算结果和&一样
                       |叫做或运算符，or运算符（有一个true，结果就是true）
                             true | false 是true     false | false是false    true | true是true
                       ||叫做或或运算符，oror运算符
                               运算结果和 | 一样
            4.小括号运算符
                       运算符优先级：算数运算符>比较运算符>布尔运算符>等号
                      （） ！     *,/,%       +,-   >,>=,<,<=      ==     !=     &,&&,|,||    =
            5.java中的位运算符
                       1.字面值的八进制和十六进制
                                 以0开头的整数为八进制（05就是十进制的5，09就是十进制的9）
                                 以0x开头的整数位十六进制(0xf就是十进制的15，0x11就是十进制的17)
                       2.按位运算符（二进制）
                                 按位  并（AND）：&
                                                 如果两个byte的这一位，都是1，结果就是1
                                                 如果两个byte的这一位，其中一个是0，结果就是0
                                 按位  或（OR）：|
                                                 两个位只要有一个是1，结果就是1   
                                 按位  异或（XOR):^
                                                 两个位不一样就是1，一样就是0
                                 按位  取反：~
                                                 0，结果为1         1，结果为0
                       3.位移运算符
                                 >>：符号位不动，其余位右移，符号位后边正数补0，负数补1（又称带符号右移）<除2>
                                 >>>：符号位一起右移，左边补0（又称无符号右移）
                                 <<左移，右边补0，左移没有带符号位一说，因为符号位在最左边<乘2>
                       4.按位运算符
11.基本数据类型的更多语法点
               1.变量要 先 赋值 后 使用 
               2.计算并赋值运算符：作用是为了让代码更简洁，（a = a + 2可以简化成a += 2）
               3.数据类型自动转换
                           3.1.自动类型转换(1.不会出现问题的类型转换，编程语言可以做自动类型转换，比如：低精度的数字向高精度的数字转换。2.自动类型转换可以发生在算数运算，也可发生在赋值。）             
                           3.2.数值精度顺序：double > float > log > int > short > byte                                             
                           3.3.char可以转化为int(虽然同样是两个byte，但是因为char是无符号数，值域超出了short可以表示的范围，所以不可以自动转为short。                                       
                           3.4.强制数据类型转换
                                           3.4.1.强制类型转换（1.可能出现问题的类型转换，需要使用强制类型转换，比如高精度数值向低精度数值转换。2.强制类型转换也是操作符。3.语法是用小括号括起来的目标类型放在被转化的值前面4.强制转换会造成数据精度丢失.）
                           3.5.数值溢出
                                               3.5.1.数值计算一旦溢出，结果将失去其原有意义。比如，两个正数会加出负数。2.要对能够处理的值有大概的估计。
12.从数值计算溢出理解程序员和编程语言责任的分界线
               1.编程语言的作用：编程语言负责按照语法执行和计算机交互。
               2.程序员的任务：程序员负责理解问题，理解程序，并将问题转换为程序
               *编程语言不负责解决问题，程序员才负责解决问题。
13.什么是字符集
                    1.字符集就是字符的集合，一般会包括一种语言的字符，比如说GBK，是包括所有常用汉字字符的字符集。ASCII是包括英文字符的字符集。
                    2.字符就是java中的char，char是chara的简写。
14.什么是编码
                 1.char代表一个字符，char的本质也是数字。将数字映射到字符，就叫编码。
                 2.将一个字符集映射到数字，就是给这个字符集编码。编码是有标准的，所有的计算机系统按照同一个编码标准执行。
                 3.有时候编码和字符集会混用。
15.编码和字符集介绍 

         常用的字符集简介
           1.ASCII码，ASCII表：https://baike.baidu.com/item/ASCII/309296#3
           2.Unicode 包含世界上所有常用字符，编码也有几种，包括UTF-8(8-bitUnicode Transformation Format)，UTF-16等。
           3.Unicode，GBK 等所有常用的字符集，会兼容ASCII。举个例子，字符A在这些所有常用的字符集里，都是对应数字65。

     Java中的字符集
           1.Java中用的是UTF-16编码的Unicode。
           2.UTF-16用16个bit，即两个byte，这也是char占用两个byte的原因。当把char转成数字的时候，需要用int。
         
     ASCI码和转义符（escape character) 
           如何输出特殊字符
               ASCII码+char，通过ASCII表可以找到需要的字符对应的数字。将这个数字转换为char，然后输出这个char。ASCII表：              https://baike.baidu.com/item/ASCI/309296#3
               转义符。转义符用来给字符赋值，也可以用在字符串里面，作为字符串中的一个字符。
                    转义符语法和常用的转义符
               \n，换行符
               \”，双引号
               \t，制表符
               \uXXXX,unicode编码对应的字符。
         字符串的“加法

               将变量穿插在字符串中输出
                         字符串可以和任何类型进行加法运算，则会将这个值的字符拼接到字符串上。
                         字符串也可以使用+=操作符来拼接
                         字符串的加法运算符符合加法运算符本身的优先级

               字符串不是Java中的基本数据类型
                         字符串类型的名字叫做String
                         虽然 String不是Java中的基础类型，但是也可以使用类似的语法String  str=“abc”；来创建。开始的时候将其当成基础类型，更容易理解。
               String不是Java中的保留字。
         String 的加法不会改变原String变量的值，改变其值要用赋值语句
16.操作符和数据类型总结
               1. 自增和自减操作符
                          1.1自增自减操作符是可以直接改变变量值的操作符
                          1.2前加加和前减减
                          1.3后加加和后减减
                          1.4其实是一个 +1操作和一个赋值操作的缩写
                2.打印26个连续的字符
                          2.1自动类型转换：char 到  int
                          2.2强制类型转换：int  到  char
               3.字符和数字的对应关系，字符集和编码
                          3.1字符串的加法：任何数据和字符串都可以相加，将这个数据的字符串和另一个字符串拼接起来。
                          3.2自增操作符
               4.程序中的知识点
                         4.1取模运算：整数的取模运算
                         4.2布尔运算：==操作符
                         4.3自增运算                        
17.程序执行流程之if-else语句
                 1.  if-else 语法，只有一个语法块被执行                       if(boolean 值) {
                 2.  if和else都是Java中的关键字                                       if语句块
                 3.  if语法                                                               } else {
                 4.  把if-else看成一个表达式，程序整体还是顺序执行的                    else语法块
                 5.  使用if-else                                                         }
18.程序循环之for语句
           1.    for语句
                    1.1让程序在满足某条件时，重复执行某个代码块。for是java中的关键字
                    1.2for语法语句和简单的示例程
                    1.3初始语句在for循环开始前执行一次，以后不再执行；循环体条件表达式在每次循环体执行前会执行，如果为ture，则执行循环体，否则循环结束；循环体后语句会在每次循环执行后被执行；
           2.         for （初始语句；循环体条件表达式；循环体后语句）{
                                 for循环体
                        }
           3.简化和增强找整除数的程序
                           1.使用for语句让程序简洁
                           2.增加新功能，输出最多10个可以整除的数
                           3.条件布尔表达式可以用for语句外部的变量
                           4.循环体执行后的语句可以有多个表达式，用逗号分开
           4.结束循环
              1.break语句可以结束循环
                在求整除程序中使用break提前结束循环
              2.continue跳过不符合条件的循环
                  continue语句可以结束当次循环的执行，开始下一次循环体的执行
19.代码块和变量的作用域
                   1.大括号括起来的就是代码块
                          1.1代码块的示例
                          1.2有名字的代码块——if-else代码块，for循环代码块，main方法代码块
                          1.3代码块也叫体，比如for循环体，main方法体
                          1.4代码块以嵌套 
                   2.变量的作用域
                           1.代码块可以使用外面的变量，反过来则不行。
                           2.代码块运行周期结束，其内声明的变量即为失效，所以变量可以重新使用。
                   3.作用域和命名空间
                             1.同一个命名空间中的变量不可以重名
                             2.为了避免变量名冲突，所以必须有命名空间
                   4.for循环嵌套
                       计算乘法表
                          1.两个数相乘，外层循环代表乘数，内层是被乘数                
                          2.循环嵌套，变量名不可以重复
                          3.使用break语句让输出的乘法表更简洁
                          4.使用String变量，做String的加法
22.程序循环之while循环语句
                增强点：找出n个可以被整除的数
                while语句的语法
                       1.条件表达式的结果是一个boolean值，如果结果为true，则执行循环体，如果为false，则循环结束
                       2.while循环体是一个代码块。所以while循环也是可以嵌套别的语句的，包括while语句，for语句，if-else语句等。
                       3.         while（条件表达式）{
                         while循环体
                           }
                       4.do-while语句——至少执行一次
                                                    1.do-while语句语法
                                                    2.do-while语句的循环体至少执行一次
                                                    3.    do{
                                     while循环体
                                                                }while(条件表达式)
    死循环（endless loop）
                 1. 死循环：无法结束的循环(endless loop / infinite loop)
                 2.一个死循环的例子
                 3.死循环是因为没有设置好结束条件，循环的结束条件很重要，要充分考虑各种边界情况。
                  一个看似死循环却不是死循环的例子
                        1.用while 找出5个能被2000000000整除的数
                        2.程序最终还是结束了，但是结果并不是我们想要的。
                  使用break语句结束循环
                            1.break语句可以结束任何循环
                            2.不考虑负数的情况，使用break改善程序
                            3.理解String stsrt的内容，为什么不是"从-2147483648开始递增"
 23.程序执行流程之switch语句
            使用if可以完成，但是略显不够整洁
            能够根据两个值相比较，进入某个代码块最适合这个情况
         1.swikth语句的语法
                 switch（用于比较的int值）{
               case目标值 1，对应一个if else（xxx）：
                                  匹配后可以执行的语句
                          case目标值 2，不可以与别的case字句重复：
                                  匹配后可以执行的语句
                            default （对应最后的else，可选）：
                                       default语句
               }
      2.switch里的case子句中也可以有任意合法的语句，比如if-else，for循环等
          3.swich语法中的break 
              *switch语句如果没有遇到break，会一直执行下下。
                        *如果我们的例子没有break会怎样
                        *没有break的情况也有用武之地
          4.switch 语句语法点总结 
              *switch语句中用于比较的值，必须是int 类型
              *switch语句适用于有固定多个目标值匹配，然后执行不同的逻辑的情况
                        *必须使用break 语句显示的结束一个 case 子句，否则 switch语句会从第一个 match的case 语句开始执行直到遇到 break 语句或者 switch语句结束
              *default子句是可选的，如果所有的case 语句都没有匹配上，才会执行default中的代码
24.循环和判断的总结（上）
                1.java中的单行注释
                  *以//为开始，到这一行结束都是注释内容
                  *注释可以是任何内容
                  *可以在一行的开始注释，也可以在程序内容后面添加注释
                  *注释不会对程序有任何影响
                   
                   多行注释：/*   */
             2.生成指定范围内的随机数
                新功能 *Math.random()生成随机数，随机数在0到1之间，类型是double
       3.生成一个在指定范围内的随机正整数程序关键点
               *得到随机数，java支持得到的0到1的double类型的随机数
               *确定基本的数学方法
               *运用取模运算符
               *使用强制类型转换
               *确保生成的数字在指定的范围内。极限思维，假设随机数是0或者1，结果是多少?假设取模后是0或者mod-1，结果会是多少？
25.循环和判断的总结（下）
   1.善假于物也
*Random方法和readint方法是两个工具，可以完成一个明确具体的功能。
2.游戏功能
 *猜数字：生成一个指定范围内的随机正整数，从命令行读取一个整数，如果和随机数同，    就算猜中。
 *固定随机数的范围
 *支持每次猜数字游戏的猜测次数，在指定次数内没猜对，则猜数字失败，否则就是成功。
 *可以支持退出游戏
 *输出剩余的猜测次数
 *每次猜测后，如果未猜中，则提示本次猜测的数字比目标数字大还是小
 *游戏结束后，输出猜数字游戏的统计
 *没有猜中，要输出这次的目标数字
 *可以设置随机数的范围，可以设置最大猜测次数。
26.用数组保存成绩
       语数外物化生的成绩怎么表示?
            *用六个变量表示，如果有更多的科目怎么办？
                     *如果有更多的科目怎么办?
            *如果想求出成绩最高的科目怎么办？
       1.数组的特点：
           *数组是相同类型的变量的集合，所有元素的类型都一样
           *可以指定数组包含的元素个数，最多为int的最大值个
           *元素有固定的顺序
           *每个元素都有一个固定的编号，称之为索引（index），从0开始递增，类型为int
       *可以像操作变量一样读写数组中的任何一个元素
             *如果说之前的变量是一张有名字的纸，可以通过这个名字读写这个变量；数组则是一个有名字的本子。本子有一个名字，。每页纸有一个页码。可以通过本子的名字和页码读写对应的数组元素
         2.创建和使用一个数组的语法
                  数组元素类型[]变量名=new数组元素类型[数组长度]
           变量名[索引]可以使用这个变量，可以读取也可以给他赋值
          3.用数组处理6门课的成绩
                3.1创建数组来表示6门课的成绩
                          *创建一个大小为6的double类型的数组
                           *创建一个大小为6的string数组，代表每一课的名字
                            *为每一门课创建一个int变量，值为这门课的成绩对应的数组的索引，以便操作每门课的成绩和名字
                 3.2求出最高的成绩
                              *创建一个大小为6的double类型的数组
                               *创建一个大小为6的string数组，保存每门课的成绩
                                 *为每一门创建一个int变量，值为这门课的成绩对应的数组的索引，以便操作每一门课的成绩
                                     *实现计算最高成绩的逻辑
27.认识变量和数组（上）
 重新认识基本类型的变量
  1.一个简单的使用变量的程序
  2.变量的基本逻辑——有定才有变。在人看来，固定的是名字，变化的是名字对应的值。对计算机来说，固定的是地址，变化的是值
  3.用人工的方式，模拟一下计算机执行给变量a赋值的过程
  4.理解计算机如何使用内存，完成变量的功能
     4.1内存就是一堆白纸，只能通过页码编号访问，也就是所谓的内存地址
     4.2变量就是使用一个固定的地址加上这个地址对应的内存。计算机通过地址读写地址对应的内存的值。完成变量的赋值和访问值的功能。就据页码编号，在指定的白纸上写字，或者擦掉再复写。
     4.3变量的名就是地址，变量的实就是地址的内存的值。
5.理解数组的名与实
      *数组的"实"是一块地址连续的内存，就好像编号连续的一沓白纸。
      *数组的名，就是这个块连续内存的地址。
      *数组的变量和基本变量一样，本身是一个地址。但是与基本变量不一样的是，这个地址的值，是数组的“名”，也就是数组的第一个地址。
 6.数组=数组变量+数组的实体
     *数组变量【索引】就是在数组原有地址的基础上，加上索引，获取想要的元素
         *所以索引是从0开始的，因为数组变量的地址就是数组第一个元素的地址，不需要
28.认识变量和数组（下）
       1.数组的长度
           使用数组的长度
            *数组变量.length可以获得数组的长度
            *数组创建之后，长度不可以改变
        2.数组索引过界和初始值
              *访问数组过界出错的例子，数组出界的错误叫做indexOutOfBoundException
              *如果没有把握数组是否出界，可以把索引和数组长度作比较。注意索引是从0开始的，不是从1开始的
               *数组里每个元素的都有初始值，初始值和类型有关。对于数字类型，初始值是0，对于boolean类型，初始值是false。 
        3.让变量指向新的数组
               *数组变量可以指向新的数组实体，这时候，数组变量的值就是新的数组实体的地址了。这种数组变量的赋值操作，叫做让变量指向新的数组。
               *如果没有别的数组变量指向原来数组实体，也就是说，如果没有数组变量“记得”原来数组的地址，原来的数组实体就再也不可访问了，也就好像“消失”了。
                *对于非基本类型的变量，计算机都要通过这种“两级跳”的方式来访问。基本类型变量，一跳就可以。    






                                    



                              
                         
