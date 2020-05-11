import java.util.Comparator;

class CollegeMinComparator implements Comparator<College>{
    public int compare(College c1, College c2){
        if(c1.totalPreferences > c2.totalPreferences){
            return 1;
        }
        if(c1.totalPreferences < c2.totalPreferences){
            return -1;
        }
        return 0;
    }
}