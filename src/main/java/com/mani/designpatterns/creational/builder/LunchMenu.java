package com.mani.designpatterns.creational.builder;

public class LunchMenu {
    private String snack;
    private String starter;
    private String mainCourse;
    private String soup;

    LunchMenu(Builder builder){
        this.snack = builder.snack;
        this.starter = builder.starter;
        this.soup = builder.soup;
        this.mainCourse = builder.mainCourse;
    }
    public String getSnack() {
        return snack;
    }

    public String getStarter() {
        return starter;
    }

    public String getMainCourse() {
        return mainCourse;
    }

    public String getSoup() {
        return soup;
    }

    @Override
    public String toString() {
        return "LunchMenu{" +
                "snack='" + snack + '\'' +
                ", starter='" + starter + '\'' +
                ", mainCourse='" + mainCourse + '\'' +
                ", soup='" + soup + '\'' +
                '}';
    }

    static class Builder{
        private String snack;
        private String starter;
        private String mainCourse;
        private String soup;

        public Builder(){

        }
        public Builder withSoup(String soup){
            this.soup = soup;
            return this;
        }
        public Builder withSnack(String snack){
            this.snack = snack;
            return this;
        }
        public Builder withStarter(String starter){
            this.starter = starter;
            return this;
        }
        public Builder withMainCourse(String mainCourse){
            this.mainCourse = mainCourse;
            return this;
        }
        public LunchMenu build(){
            return new LunchMenu(this);
        }
    }

    public static void main(String[] args) {
        LunchMenu.Builder builder = new LunchMenu.Builder();
        LunchMenu lunchMenu = builder.withMainCourse("NorthIndian").build();
        System.out.println(lunchMenu);
        LunchMenu lunchMenu1 = builder.withMainCourse("Chinese").withSoup("Hot&Sour").build();
        System.out.println(lunchMenu1);
    }
}
