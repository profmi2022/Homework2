public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var totalWeight = boxer1 + boxer2;
        System.out.println("Общий вес двух бойцов " + totalWeight + " кг");
        var diffWeights = boxer2 - boxer1;
        System.out.println("Разница весов боксеров " + diffWeights + " кг");
        diffWeights = boxer2 % boxer1;
        System.out.println("Разница весов боксеров " + diffWeights + " кг");

        var totalTime = 640;
        var personTime = 8;
        var numberOfStaff = totalTime / personTime;
        System.out.println("Всего работников в компании – " + numberOfStaff + " человек");

        numberOfStaff = numberOfStaff + 94;
        totalTime = numberOfStaff * 8;
        System.out.println("Если в компании работает " + numberOfStaff + " человек, то всего " + totalTime + " часа работы может быть поделено между сотрудниками");



    }

}



