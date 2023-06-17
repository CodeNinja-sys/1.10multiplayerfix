/*
 * Decompiled with CFR 0.150.
 */
package d.b.a.a;

import d.a.c;
import d.b.a.a.a.b;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class a
implements d.a.a {
    private static final String a = "\\s+:\\s";
    private c[] b = null;
    private d.a.b c = null;

    public d.a.b b() {
        if (this.c == null) {
            this.c = new b();
        }
        return this.c;
    }

    public c[] a() {
        if (this.b == null) {
            ArrayList<d.b.a.a.a.a> arrayList = new ArrayList<d.b.a.a.a.a>();
            Scanner scanner = null;
            try {
                scanner = new Scanner(new FileReader("/proc/cpuinfo"));
            }
            catch (FileNotFoundException fileNotFoundException) {
                System.err.println("Problem with: /proc/cpuinfo");
                System.err.println(fileNotFoundException.getMessage());
                return null;
            }
            scanner.useDelimiter("\n");
            d.b.a.a.a.a a2 = null;
            while (scanner.hasNext()) {
                String string = scanner.next();
                if (string.equals("")) {
                    if (a2 != null) {
                        arrayList.add(a2);
                    }
                    a2 = null;
                    continue;
                }
                if (a2 == null) {
                    a2 = new d.b.a.a.a.a();
                }
                if (string.startsWith("model name\t")) {
                    a2.b(string.split(a)[1]);
                    continue;
                }
                if (string.startsWith("flags\t")) {
                    String[] arrstring = string.split(a)[1].split(" ");
                    boolean bl2 = false;
                    for (String string2 : arrstring) {
                        if (!string2.equalsIgnoreCase("LM")) continue;
                        bl2 = true;
                        break;
                    }
                    a2.a(bl2);
                    continue;
                }
                if (string.startsWith("cpu family\t")) {
                    a2.f(string.split(a)[1]);
                    continue;
                }
                if (string.startsWith("model\t")) {
                    a2.e(string.split(a)[1]);
                    continue;
                }
                if (string.startsWith("stepping\t")) {
                    a2.d(string.split(a)[1]);
                    continue;
                }
                if (!string.startsWith("vendor_id")) continue;
                a2.a(string.split(a)[1]);
            }
            scanner.close();
            if (a2 != null) {
                arrayList.add(a2);
            }
            this.b = arrayList.toArray(new c[0]);
        }
        return this.b;
    }
}

