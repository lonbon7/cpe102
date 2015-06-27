import java.util.ArrayList;

public class BinarySearcher
        {
            private ArrayList<String> a;

            public BinarySearcher(ArrayList<String> array)
            {
                this.a = array;
            }

            public int search(int value)
            {
                int lo = 0;
                int hi = a.size() - 1;

                while (lo <= hi)
                {
                    int mid = (lo + hi) / 2;
             
                    if (a.get(mid).compareTo(a.get(value)) > 0)
                    {
                        hi = mid - 1;
                    }
                    else if (a.get(mid).compareTo(a.get(value)) < 0)
                    {
                        lo = mid + 1;
                    }
                    else
                    {
                        return mid;
                    }
                }

                return -1;
            }
        }
