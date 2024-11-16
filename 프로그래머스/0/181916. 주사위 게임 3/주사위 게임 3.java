import java.util.stream.Stream;

class Solution {
    public int solution(int a, int b, int c, int d) {
            int answer = 0;
        if (a==b&&b==c&&c==d) {
            answer=a*1111;
        } else if (a!=b&& a!=c&& a!=d&&b!=c&& b!=d&& c!=d) {
            answer = Stream.of(a,b,c,d).min(Integer::compare).orElse(null);
        } else if ((a == b && a == c && a != d)){
            answer = (10*a+d)*(10*a+d);            
        } else if ((a == b && a == d && a != c)){
            answer = (10*a+c)*(10*a+c);            
        } else if ((a == d && a == c && a != b)){
            answer = (10*a+b)*(10*a+b);            
        }else if ((d == b && d == c && a != d)){
            answer = (10*d+a)*(10*d+a);            
        }else if (a==b&&c==d&&a!=c){
            answer=(a+c)*((a-c>0 ? a-c:c-a));
        }else if (a==c&&b==d&&a!=b){
            answer=(a+b)*((a-b>0 ? a-b:b-a));
        }else if (a==d&&b==c&&a!=b){
            answer=(a+b)*((a-b>0 ? a-b:b-a));
        }else {
              if (a == b && a != c && a != d) {
        answer = c * d;
    } else if (a == c && a != b && a != d) {
        answer = b * d;
    } else if (a == d && a != b && a != c) {
        answer = b * c;
    } else if (b == c && b != a && b != d) {
        answer = a * d;
    } else if (b == d && b != a && b != c) {
        answer = a * c;
    } else if (c == d && c != a && c != b) {
        answer = a * b;
    }
        }
        return answer;
    }
}