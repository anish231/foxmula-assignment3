package com.foxmula.assignment3c;

class Point implements Comparable
{
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString()
    {
        return ""+y;
    }

    public int compareTo(Object o)
    {
        Point p=(Point)o;

        if(this.x<p.x)
        {
            return -1;
        }

        else if(this.x>p.x)
        {
            return 1;
        }

        else
        {
            if(this.y<p.y)
            {
                return -1;
            }

            else if(this.y>p.y)
            {
                return 1;
            }
            else
            {
                return 0;
            }
        }
    }
}
