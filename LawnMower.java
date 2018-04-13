package individualEvaluation;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.PriorityQueue;

public class LawnMower {
 

 
      public static void main(String[] args) throws IOException
      {
          // IO handlers
          BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
          BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));
          
          String first;
          
          while((first = r.readLine()).charAt(0) != '0')
          {
              String[] params = first.split(" ");
              String[] length = r.readLine().split(" ");
              String[] width = r.readLine().split(" ");
              double mowerFull = Double.parseDouble(params[2]);
              double mowerHalf = mowerFull / 2;
              
              PriorityQueue<Double> cutLength = new PriorityQueue<Double>();
              PriorityQueue<Double> cutWidth = new PriorityQueue<Double>();
              
              for(int i = 0; i < Integer.parseInt(params[0]); i++)
              {
                  double mid = Double.parseDouble(length[i]);
                  double start = mid - mowerHalf;
                  if(start < 0)
                      start = 0;
                  cutLength.add(start);
              }
              
              for(int i = 0; i < Integer.parseInt(params[1]); i++)
              {
                  double mid = Double.parseDouble(width[i]);
                  double start = mid - mowerHalf;
                  if(start < 0)
                      start = 0;
                  cutWidth.add(start);
              }
              
              boolean success = true;
              
              double lengthEnd = 0;
              double widthEnd = 0;
              
              while(!cutLength.isEmpty() && success)
              {
                  double start = cutLength.poll();
                  if(start > lengthEnd)
                      success = false;
                  else
                      lengthEnd = start + mowerFull;
              }
              
              if(lengthEnd < 75)
                  success = false;
              
              while(!cutWidth.isEmpty() && success)
              {
                  double start = cutWidth.poll();
                  if(start > widthEnd)
                      success = false;
                  else
                      widthEnd = start + mowerFull;
              }
              
              if(widthEnd < 100)
                  success = false;
              
              if(success)
                  w.write("YES");
              else
                  w.write("NO");
              
              w.newLine();
          }
          
          
          r.close();
          w.close();
      }
  }


