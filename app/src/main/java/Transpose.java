import org.jfugue.player.Player;
import java.util.List;
import java.util.ArrayList;
public class Transpose {
    public void playSound() {
        Player player = new Player();
        player.play("A");
    }
    List<String> notes = new ArrayList<String>();
    public void makeNotes() {
        notes.add("A");
        notes.add("A#/B♭");
        notes.add("B");
        notes.add("C");
        notes.add("C#/D♭");
        notes.add("D");
        notes.add("D#/E♭");
        notes.add("E");
        notes.add("F");
        notes.add("F#/G♭");
        notes.add("G");
        notes.add("G#/A♭");
    }
    List<String> transposedNotes = new ArrayList<String>();
    public List<String> changeNote(int halfSteps) {
        for (int i = 0; i < notes.size(); i++) {
            int newPosition = (i + halfSteps) % notes.size();
            transposedNotes.add(newPosition, notes.get(i));
        }
        return transposedNotes;
    }
}
