package Question97;

public enum EnumFromCh96 {
    SUNDAY(false), MONDAY(true), TUESDAY(true), WEEDNESDAY(true), THURSDAY(true), FRIDAY(true), SATURDAY(false);

    final boolean IsWeekDay;

    EnumFromCh96(boolean isWeekDay) {
        IsWeekDay = isWeekDay;
    }

    public String dayAnalizer(){
        if(IsWeekDay){
            return name() + " is a weekday ";
        } else {
            return name() +" is a weekend day";
        }
    }
}
