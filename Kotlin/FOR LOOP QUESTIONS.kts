/*Write a while loop that checks the humidity (not the humidityLevel). The variable humidityLevel starts at 80. The variable humidity is initialized with "humid". If it is "humid" then it should reduce the "humidityLevel" by 5 and print "humidity decreased"
Once the humidityLevel is below 60 it should print "it's comfy now" and set the humidity to "comfy"
 */

var humidity = "humid"
var humiditylevel = 80
while(humidity == "humid"){
    humiditylevel -= 5
    print("humidity is decreased")
    if(humiditylevel < 60){
        humidity = "comfy"
        print("its comfy now")
    }
}



