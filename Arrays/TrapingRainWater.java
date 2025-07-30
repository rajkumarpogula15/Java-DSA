public class TrapingRainWater {
    public static void main(String[] args){
        int Height[]={3,2,0,5,3,0,0,6,2,4};
        int Left_max[]= new int[Height.length];
        int Right_max[]= new int[Height.length];
        int WaterLevel[]= new int[Height.length];
        int TrapedWater[]=new int[Height.length];
        //calculating left max
        Left_max[0]=Height[0];
        for(int i=1;i<Height.length;i++){
            Left_max[i]=Math.max(Height[i],Left_max[i-1]);
        }

        //calculating right max
        Right_max[Height.length-1]=Height[Height.length-1];
        for(int i=Height.length-2;i>=0;i--){
            Right_max[i]=Math.max(Height[i],Right_max[i+1]);
        }

        //calculating min of right and left max
        
        for(int i=0;i<Height.length;i++){
            WaterLevel[i]=Math.min(Right_max[i],Left_max[i]);
        }

        // calculating Traped water
        
        for(int i=0;i<Height.length;i++){
            TrapedWater[i]=WaterLevel[i]-Height[i];
        }

        //Total Traped rainwater
        int TotalWater=0;
        for(int i=0;i<Height.length;i++){
            TotalWater+=TrapedWater[i];
        }

        System.out.println("Total water Traped"+TotalWater);
    }
}
