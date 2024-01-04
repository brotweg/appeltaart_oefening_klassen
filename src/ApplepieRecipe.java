public class ApplepieRecipe {

    Ingredients roomboter = new Ingredients(200, "gram", "ongezouten roomboter");
    Ingredients suiker = new Ingredients(200, "gram", "witte basterdsuiker");
    Ingredients bakmeel = new Ingredients(400, "gram", "zelfrijzend bakmeel");
    Ingredients ei = new Ingredients(1, "stuk(s)", "eieren");
    Ingredients vanillesuiker = new Ingredients(8, "gram", "vanille suiker");
    Ingredients zout = new Ingredients(1, "snuf", "zout");

    public void printIngredients() {
        System.out.println(roomboter.getAmount() + " " + roomboter.getUnit() + " " + roomboter.getName());
    }


    public void preheat() {
        System.out.println("Verwarm de oven van te voren op 170 graden Celsius (boven en onderwarmte)");
    }

    public void beatEggs(){
        System.out.println("Klop het ei los en verdeel deze in twee delen. De ene helft is voor het deeg, het andere deel is voor het bestrijken van de appeltaart.");
    }

    public void makDough(){
        System.out.println("Meng de boter, bastard suiker, zelfrijzend bakmeel, een helft van het ei, vanille suiker en een snufje zout tot een stevig deeg en verdeel deze in 3 gelijke delen.");
    }

    public void prepareApples(){
        System.out.println("Schil nu de appels en snij deze in plakjes. Vermeng in een kopje de suiker en kaneel.");
    }

    public void preparePan(){
        System.out.println("Vet de springvorm in en bestrooi deze met bloem.");
    }

    public void putDoughInPan() {
        System.out.println("Gebruik een deel van het deeg om de bodem van de vorm te bedekken. Gebruik een deel van het deeg om de rand van de springvorm te bekleden. Strooi het paneermeel op de bodem van de beklede vorm. De paneermeel neemt het vocht van de appels op.");
    }

    public void putApplesInPan() {
        System.out.println("Doe de heft van de appels in de vorm en strooi hier 1/3 van het kaneel-suiker mengsel overheen.");
    }

    public void putApplesInPan2() {
        System.out.println("Meng de ander helft van de appels met het overgebleven kaneel-suiker mengsel en leg deze in de vorm.");
    }

    public void rollDough() {
        System.out.println("Rol het laatste deel van de deeg uit tot een dunne lap en snij stroken van ongeveer 1 cm breed.");
    }

    public void putDoughOnPie() {
        System.out.println("Leg de stroken kuislings op de appeltaart. Met wat extra deegstroken werk je de rand rondom af.");
    }

    public void putEggOnPie() {
        System.out.println("Gebruik het overgebleven ei om de bovenkant van het deeg te bestrijken.");
    }

    public void bakePie() {
        System.out.println("Zet de taart iets onder het midden van de oven. Bak de taart in 60 minuten op 170 graden Celsius (boven en onderwarmte) gaar en goudbruin.");
    }

    public void allIngredients() {
        System.out.println(roomboter.getAmount() + " " + roomboter.getUnit() + " " + roomboter.getName());
        System.out.println(suiker.getAmount() + " " + suiker.getUnit() + " " + suiker.getName());
        System.out.println(bakmeel.getAmount() + " " + bakmeel.getUnit() + " " + bakmeel.getName());
        System.out.println(ei.getAmount() + " " + ei.getUnit() + " " + ei.getName());
        System.out.println(vanillesuiker.getAmount() + " " + vanillesuiker.getUnit() + " " + vanillesuiker.getName());
        System.out.println(zout.getAmount() + " " + zout.getUnit() + " " + zout.getName());

    }

    public void allSteps() {
        preheat();
        beatEggs();
        makDough();
        prepareApples();
        preparePan();
        putDoughInPan();
        putApplesInPan();
        putApplesInPan2();
        rollDough();
        putDoughOnPie();
        putEggOnPie();
        bakePie();
    }




}









