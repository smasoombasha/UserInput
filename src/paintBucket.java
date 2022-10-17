public class paintBucket {
    public static void main(String[] args){
        System.out.println(getBucketCount(-1, 2, 4, 1));
        System.out.println(getBucketCount(2.75, 3.25, 2.5, 1));
        System.out.println(getBucketCount(3.4, 2.1, 1.5));
        System.out.println(getBucketCount(3.4, 1.5));
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, double extraBucket){
        if((width<=0 || height<=0 || areaPerBucket <=0) || (extraBucket <0)){
            return -1;
        }else{
            //  System.out.println("Sucess");
            double area = width * height;
            double hasPaint = areaPerBucket * extraBucket;
            double wanted = area - hasPaint;
            double required = Math.round(wanted / areaPerBucket);
          //  System.out.println(wanted);
          //  System.out.println(required);
            return (int) required;
        }
    }

    public static int getBucketCount(double width, double height, double areaPerBucket){
        if(width <=0 || height <0 || areaPerBucket<=0){
            return -1;
        }else{
            double area = width*height;
            double required = Math.round(area/areaPerBucket);
           // System.out.println("second method");
            return (int) required;
        }
    }
    public static int getBucketCount(double area, double areaPerBucket){
        if(area <=0 || areaPerBucket <=0){
            return -1;
        }else{
            double required = Math.ceil(area /areaPerBucket);
           // System.out.println("third method");
            return (int) required;
        }
    }
}
