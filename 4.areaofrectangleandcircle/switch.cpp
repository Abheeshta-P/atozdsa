#include <cmath>
double areaSwitchCase(int ch, vector<double> a) {
	//additional info a.size() gives size of vector
        switch(ch){
            case 1:
            return (M_PI*(a[0]*a[0]));
          
            case 2:
           return (a[0]*a[1]);
          
           default:
           return -1;
        }
        
    }


