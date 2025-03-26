public class array {
    public static void main(String args[])
    {
        int nums[]={5,6,7};
        System.out.println(nums[1]);

        for(int i=0;i<=2;i++)
        {
            System.out.println(nums[i]);
        }


        //Dynamically//
        int nums2[]= new int[4];
        nums2[0]=1;
        nums2[1]=4;
        nums2[2]=6;
        nums2[3]=9;

        System.out.println(nums2[3]);

        for(int i=0;i<=3;i++)
        {
            System.out.println(nums2[i]);
        }
    }
}
