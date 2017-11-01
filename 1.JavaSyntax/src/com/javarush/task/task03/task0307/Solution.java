package com.javarush.task.task03.task0307;

/* 
Привет Starcraft!
*/

public class Solution {
    public static void main(String[] args) {
        Zerg zerg1 = new Zerg();
        zerg1.name = "zerg"+1;
        Zerg zerg2 = new Zerg();
        zerg2.name = "zerg"+2;
        Zerg zerg3 = new Zerg();
        zerg3.name = "zerg"+3;
        Zerg zerg4 = new Zerg();
        zerg4.name = "zerg"+4;
        Zerg zerg5 = new Zerg();
        zerg5.name = "zerg"+5;
        Zerg zerg6 = new Zerg();
        zerg6.name = "zerg"+6;
        Zerg zerg7 = new Zerg();
        zerg7.name = "zerg"+7;
        Zerg zerg8 = new Zerg();
        zerg8.name = "zerg"+8;
        Zerg zerg9 = new Zerg();
        zerg9.name = "zerg"+9;
        Zerg zerg10 = new Zerg();
        zerg10.name = "zerg"+10;

        Protoss protos1 = new Protoss();
        protos1.name = "Protos"+1;
        Protoss protos2 = new Protoss();
        protos2.name = "Protos"+2;
        Protoss protos3 = new Protoss();
        protos3.name = "Protos"+3;
        Protoss protos4 = new Protoss();
        protos4.name = "Protos"+4;
        Protoss protos5 = new Protoss();
        protos5.name = "Protos"+5;

        Terran terran1 = new Terran();
        terran1.name = "terran"+1;
        Terran terran2 = new Terran();
        terran2.name = "terran"+2;
        Terran terran3 = new Terran();
        terran3.name = "terran"+3;
        Terran terran4 = new Terran();
        terran4.name = "terran"+4;
        Terran terran5 = new Terran();
        terran5.name = "terran"+5;
        Terran terran6 = new Terran();
        terran6.name = "terran"+6;
        Terran terran7 = new Terran();
        terran7.name = "terran"+7;
        Terran terran8 = new Terran();
        terran8.name = "terran"+8;
        Terran terran9 = new Terran();
        terran9.name = "terran"+9;
        Terran terran10 = new Terran();
        terran10.name = "terran"+10;
        Terran terran11 = new Terran();
        terran11.name = "terran"+11;
        Terran terran12 = new Terran();
        terran12.name = "terran"+12;
    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
