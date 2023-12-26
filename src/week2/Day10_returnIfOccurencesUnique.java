package week2;

import java.util.*;


public class Day10_returnIfOccurencesUnique {

    static int[] arr = new int[7];
    static int[] arrCount = new int[arr.length];
    static ArrayList<Integer> arrLcount= new ArrayList<Integer>();
    static Map<Integer, Integer> map = new HashMap<>();

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 7 numbers");

        for(int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }

        countOccurences(arr);
    }

    static void countOccurences(int[] arr)
    {

                for (int num : arr) {
                    map.put(num, map.getOrDefault(num, 0) + 1);
                }

                Iterator<Map.Entry<Integer,Integer>> itr = map.entrySet().iterator();

                while(itr.hasNext())
                {
                    System.out.println(itr.next());
                }


                Set<Integer> set = new HashSet<>(map.values());
                System.out.println(map.size() == set.size());
            }
        }


