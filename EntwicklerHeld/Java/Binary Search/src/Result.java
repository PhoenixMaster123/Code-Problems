public class Result {
        public int step;
        public int index;

        public Result(int step, int index) {
            this.step = step;
            this.index = index;
        }

        @Override
        public String toString() {
            return "(step:" +  step + ", index: " + index + ")";
        }

        @Override
        public boolean equals(Object o) {
            if (null == o || !(o instanceof Result)) {
                return false;
            }
            if (o == this) {
                return true;
            }

            Result r = (Result) o;
            return r.step == this.step && r.index == this.index;
        }
    }
