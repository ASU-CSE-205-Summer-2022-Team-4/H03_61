/** CSE205 Object Oriented Programming and Data Structures, Summer 2022 C-Session
Homework 3

Group 4
AUTHOR: David McConnell  dmcconn7    dmcconn7@asu.edu
 AUTHOR: Lia Moua         amoua       amoua@asu.edu
 AUTHOR: Arsal Akhtar     akakhta2    akakhta2@asu.edu
 AUTHOR: Kari McBride     kemcbri2    kemcbri2@asu.edu
 */

public class H03_61 {
    public class Point implements Comparable<Point> {
        private double mX;
        private double mY;

        public Point(double pX, double pY) {
            setX(pX);
            setY(pY);
        }

        // Accessor method for mX.
        public double getX() {
            return mX;
        }

        // Accessor method for mY.
        public double getY() {
            return mY;
        }

        // Mutator method for mX.
        public void setX(double pX) {
            mX = pX;
        }

        // Mutator method for mY.
        public void setY(double pY) {
            mY = pY;
        }

        private double calcDistanceToOrigin() {
            return Math.sqrt(mX*mX + mY*mY);
        }
        public int compareTo(Point pDistDiff) {
            double thisDist = this.calcDistanceToOrigin();
            double cDist = pDistDiff.calcDistanceToOrigin();
            if (thisDist < cDist) {
                return -1;
            }
            else if (thisDist > cDist) {
                return 1;
            }
            else {
                return 0;
            }
        }
    }
}
