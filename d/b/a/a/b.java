/*
 * Decompiled with CFR 0.150.
 */
package d.b.a.a;

import d.b.a.a;
import d.b.a.a.a.c;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class b
implements a {
    private d.b.a.b a = null;
    private String b = null;

    public String a() {
        if (this.b == null) {
            Scanner scanner;
            try {
                scanner = new Scanner(new FileReader("/etc/os-release"));
            }
            catch (FileNotFoundException fileNotFoundException) {
                return "";
            }
            scanner.useDelimiter("\n");
            while (scanner.hasNext()) {
                String[] arrstring = scanner.next().split("=");
                if (!arrstring[0].equals("NAME")) continue;
                this.b = arrstring[1].replaceAll("^\"|\"$", "");
                break;
            }
            scanner.close();
        }
        return this.b;
    }

    public String b() {
        return "GNU/Linux";
    }

    public d.b.a.b c() {
        if (this.a == null) {
            this.a = new c();
        }
        return this.a;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.b());
        stringBuilder.append(" ");
        stringBuilder.append(this.a());
        stringBuilder.append(" ");
        stringBuilder.append(this.c().toString());
        return stringBuilder.toString();
    }
}

