import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class hw3task2 {
    public static void main(String[] arg){
           List<String> planets= planetsCounter(10);
           deleteRecurrentPlanets(planets);
    }

        // Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
//  Вывести название каждой планеты и количество его повторений в списке.

    public static  List<String> planetsCounter(int n){
        List<String> listPlanets = List.of("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune");
        List<String> randPlanets = new ArrayList<String>(n);
        int[] counts = new int[listPlanets.size()];

        Random rand = new Random();
        

        for (int i = 0; i < n; i++) {
            randPlanets.add(listPlanets.get(rand.nextInt(listPlanets.size())));
            System.out.print(randPlanets.get(i) + " ");
            counts[listPlanets.indexOf(randPlanets.get(i))]++;
        }
        
        System.out.println();

        for (int i = 0; i < counts.length; i++) 
            System.out.printf("%s - %s\n", listPlanets.get(i), counts[i]);
            System.out.println();
            return randPlanets;
    }

// Задание 2
// Для списка из задачи про Солнечную систему удалить все повторяющиеся элементы.
public static void deleteRecurrentPlanets(List<String> planets){
   
   for (int i = planets.size() - 1; i > 0; i--)
    if (planets.indexOf(planets.get(i)) != i) planets.remove(i);
    
     List<String> planets2 = new ArrayList<String>(planets.size());
     int[] counts = new int[planets.size()];

      for (int i = 0; i < planets.size(); i++) {
            planets2.add(planets.get(i));
            counts[planets.indexOf(planets2.get(i))]++;
        }
      for (int i = 0; i < counts.length; i++) 
            System.out.printf("%s - %s\n", planets.get(i), counts[i]);
        System.out.println();


}
    }


