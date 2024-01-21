

public class Checker {
    public boolean isDayOfWeek(String string){
        return string.matches("mon|tue|wed|thu|fri|sat|sun");
    }
    public boolean allVowels(String string){
        return string.matches("(a|e|i|o|u)*");
    }
    
//    00:00:00 and 23:59:59.
    public boolean timeOfDay(String string){
        return string.matches("(00|01|02|03|04|05|06|07|08|09|10|11|12|13|14|15|16|17|18|19|20|21|22|23):[0-5][0-9]:[0-5][0-9]");
//        return string.matches("[00-23]:[0-5][0-9]:[0-5][0-9]");
    }
}
