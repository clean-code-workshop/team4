package eu.sig.training.ch03;

import java.awt.Color;
import java.util.Arrays;
import java.util.List;

public class FlagFactory {

    // tag::getFlag[]
    public List<Color> getFlagColors(Nationality nationality) {
        List<Color> result;
        switch (nationality) {
        case DUTCH:
            result = Arrays.asList(Color.RED, Color.WHITE, Color.BLUE);
            break;
        case GERMAN:
            result = Arrays.asList(Color.BLACK, Color.RED, Color.YELLOW);
            break;
        case BELGIAN:
            result = Arrays.asList(Color.BLACK, Color.YELLOW, Color.RED);
            break;
        case FRENCH:
            result = Arrays.asList(Color.BLUE, Color.WHITE, Color.RED);
            break;
        case Estonian:
            result = Arrays.asList(Color.BLUE, Color.BLACK, Color.WHITE);
            break;
        case ITALIAN:
            result = Arrays.asList(Color.GREEN, Color.WHITE, Color.RED);
            break;
        case ROMANIA:
            result = Arrays.asList(Color.BLUE, Color.YELLOW, Color.RED);
            break;
        case IRELAND:
            result = Arrays.asList(Color.GREEN, Color.WHITE, Color.ORANGE);
            break;
        case HUNGARIAN:
            result = Arrays.asList(Color.RED, Color.WHITE, Color.GREEN);
            break;
        case BULGARIAN:
            result = Arrays.asList(Color.WHITE, Color.GREEN, Color.RED);
            break;
        case RUSSIA:
            result = Arrays.asList(Color.WHITE, Color.BLUE, Color.RED);
            break;
        case UNCLASSIFIED:
        default:
            result = Arrays.asList(Color.GRAY);
            break;
        }
        return result;
    }
    // end::getFlag[]

}
