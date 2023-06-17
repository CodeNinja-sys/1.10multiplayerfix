/*
 * Decompiled with CFR 0.150.
 */
package d.b.a.a.a;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class b
implements d.a.b {
    private long a = 0L;

    public long b() {
        long l2 = 0L;
        Scanner scanner = null;
        try {
            scanner = new Scanner(new FileReader("/proc/meminfo"));
        }
        catch (FileNotFoundException fileNotFoundException) {
            return l2;
        }
        scanner.useDelimiter("\n");
        while (scanner.hasNext()) {
            String string = scanner.next();
            if (!string.startsWith("MemFree:") && !string.startsWith("MemAvailable:")) continue;
            String[] arrstring = string.split("\\s+");
            l2 = new Long(arrstring[1]);
            if (arrstring[2].equals("kB")) {
                l2 *= 1024L;
            }
            if (!arrstring[0].equals("MemAvailable:")) continue;
            break;
        }
        scanner.close();
        return l2;
    }

    public long a() {
        if (this.a == 0L) {
            Scanner scanner = null;
            try {
                scanner = new Scanner(new FileReader("/proc/meminfo"));
            }
            catch (FileNotFoundException fileNotFoundException) {
                this.a = 0L;
                return this.a;
            }
            scanner.useDelimiter("\n");
            while (scanner.hasNext()) {
                String string = scanner.next();
                if (!string.startsWith("MemTotal:")) continue;
                String[] arrstring = string.split("\\s+");
                this.a = new Long(arrstring[1]);
                if (!arrstring[2].equals("kB")) break;
                this.a *= 1024L;
                break;
            }
            scanner.close();
        }
        return this.a;
    }
}

