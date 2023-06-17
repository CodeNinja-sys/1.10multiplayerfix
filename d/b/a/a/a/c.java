/*
 * Decompiled with CFR 0.150.
 */
package d.b.a.a.a;

import d.b.a.b;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class c
implements b {
    private String a = null;
    private String b = null;
    private String c = null;

    public c() {
        Scanner scanner = null;
        try {
            scanner = new Scanner(new FileReader("/etc/os-release"));
        }
        catch (FileNotFoundException fileNotFoundException) {
            return;
        }
        scanner.useDelimiter("\n");
        while (scanner.hasNext()) {
            String[] arrstring = scanner.next().split("=");
            if (arrstring[0].equals("VERSION_ID")) {
                this.b(arrstring[1].replaceAll("^\"|\"$", ""));
            }
            if (!arrstring[0].equals("VERSION")) continue;
            arrstring[1] = arrstring[1].replaceAll("^\"|\"$", "");
            String[] arrstring2 = arrstring[1].split("[()]");
            if (arrstring2.length <= 1) {
                arrstring2 = arrstring[1].split(", ");
            }
            if (arrstring2.length > 1) {
                this.a(arrstring2[1]);
                continue;
            }
            this.a(arrstring[1]);
        }
        scanner.close();
    }

    public String a() {
        return this.b;
    }

    public String b() {
        return this.a;
    }

    public void a(String string) {
        this.b = string;
    }

    public void b(String string) {
        this.a = string;
    }

    public String toString() {
        if (this.c == null) {
            this.c = this.b() + " (" + this.a() + ")";
        }
        return this.c;
    }
}

