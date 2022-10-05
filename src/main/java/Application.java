import com.googlecode.lanterna.TerminalSize;
import com.googlecode.lanterna.TextCharacter;
import com.googlecode.lanterna.screen.Screen;
import com.googlecode.lanterna.screen.TerminalScreen;
import com.googlecode.lanterna.terminal.DefaultTerminalFactory;
import com.googlecode.lanterna.terminal.Terminal;

import java.io.IOException;

class Application {
    public static void main(String[] args) throws IOException {
        Game game = new Game();
        game.run();
/*
        private void draw() throws IOException {
            screen.clear();
            hero.draw(screen);
            screen.refresh();
        }
*/
    }


}
