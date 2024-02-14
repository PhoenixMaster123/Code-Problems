import java.util.ArrayList;
import java.util.List;
class Move {
    private int treeLayers;
    private String fromTreeStand;
    private String toTreeStand;

    public Move(int treeLayers, String fromTreeStand, String toTreeStand) {
        this.treeLayers = treeLayers;
        this.fromTreeStand = fromTreeStand;
        this.toTreeStand = toTreeStand;
    }

    public int getTreeLayers() {
        return treeLayers;
    }

    public String getFromTreeStand() {
        return fromTreeStand;
    }

    public String getToTreeStand() {
        return toTreeStand;
    }
}

public class Main {
    public static void main(String[] args) {
        // Define the tree layers and tree stand names
        int treeLayers = 3; // Change this value as needed
        String sourceTreeStand = "A";
        String destinationTreeStand = "C";
        String auxiliaryTreeStand = "B";

        // Call the christmasTreeOfHanoi method to get the moves
        List<Move> moves = christmasTreeOfHanoi(treeLayers, sourceTreeStand, destinationTreeStand, auxiliaryTreeStand);

        // Print the moves
        for (Move move : moves) {
            System.out.println("Move " + move.getTreeLayers() + " tree layer(s) from " + move.getFromTreeStand() + " to " + move.getToTreeStand());
        }
    }

    public static List<Move> christmasTreeOfHanoi(int treeLayers, String sourceTreeStand, String destinationTreeStand, String auxiliaryTreeStand) {
        List<Move> moves = new ArrayList<>();

        if (treeLayers == 1) {
            moves.add(new Move(1, sourceTreeStand, destinationTreeStand));
        } else {
            moveTree(treeLayers, sourceTreeStand, destinationTreeStand, auxiliaryTreeStand, moves);
        }
        return moves;

        /////////////////////////////////// Variant 2 //////////////////////////
        /*  List<Move> moves = new ArrayList<Move>();

        if (treeLayers == 1) {
            moves.add(new Move(treeLayers, sourceTreeStand, destinationTreeStand));
            return moves;
        }
        // take one from src to dest
        moves.addAll(christmasTreeOfHanoi(treeLayers - 1, sourceTreeStand, auxiliaryTreeStand, destinationTreeStand));
        moves.add(new Move(treeLayers, sourceTreeStand, destinationTreeStand));
        // switch
        moves.addAll(christmasTreeOfHanoi(treeLayers - 1, auxiliaryTreeStand, destinationTreeStand, sourceTreeStand));
        return moves;

         */
    }

    public static void moveTree(int layers, String source, String destination, String auxiliary, List<Move> moves) {
        if (layers == 1) {
            moves.add(new Move(1, source, destination));
        } else {
            moveTree(layers - 1, source, auxiliary, destination, moves);
            moves.add(new Move(layers, source, destination));
            moveTree(layers - 1, auxiliary, destination, source, moves);
        }
    }
}
