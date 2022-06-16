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
