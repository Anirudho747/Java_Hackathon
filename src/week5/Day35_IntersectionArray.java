package week5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Day35_IntersectionArray {

    public static void main(String[] args)
    {
        Integer[] nums1 = {4, 9, 5};
        Integer[] nums2 = {9, 4, 9, 8, 4};
        Integer[] nums3 = {1, 2, 2, 1};
        Integer[] nums4 = {2,2};

        Integer[] answer=arrayIntersection(nums3,nums4);

        for(int i=0;i<answer.length;i++)
        {
            System.out.println(answer[i]);
        }
    }

    static Integer[] arrayIntersection(Integer[] nums1,Integer[] nums2)
    {
        ArrayList<Integer> al = new ArrayList<Integer>();
        List<Integer> n1 = new ArrayList<Integer>();
        Collections.addAll(n1, nums1);

        for(int i=0;i<nums2.length-1;i++)
        {
            if((n1.contains(nums2[i])) && !(al.contains(nums2[i])))
            {
                al.add(nums2[i]);
            }
        }

        Integer[] intersection = new Integer[al.size()];
        intersection = al.toArray(intersection);

        return intersection;
    }
    }
