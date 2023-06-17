/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.b;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.StringTokenizer;
import org.apache.commons.b.p;
import org.apache.commons.b.s;
import org.apache.commons.b.t;
import org.apache.commons.b.w;

public class n {
    private static final n a = new n();
    private static final int b = -1;
    private static final int c = 0;
    private static final int d = 1;
    private static final int e = 2;
    private static final int f = 3;
    private static final int g;
    private static final String h;

    public static long a(String string) {
        return a.a(string, g, false, -1L);
    }

    public static long b(String string) {
        return n.a(string, -1L);
    }

    public static long a(String string, long l2) {
        return a.a(string, g, true, l2);
    }

    public static long a() {
        return n.a(-1L);
    }

    public static long a(long l2) {
        return n.a(new File(".").getAbsolutePath(), l2);
    }

    long a(String string, int n2, boolean bl2, long l2) {
        if (string == null) {
            throw new IllegalArgumentException("Path must not be empty");
        }
        switch (n2) {
            case 1: {
                return bl2 ? this.b(string, l2) / 1024L : this.b(string, l2);
            }
            case 2: {
                return this.a(string, bl2, false, l2);
            }
            case 3: {
                return this.a(string, bl2, true, l2);
            }
            case 0: {
                throw new IllegalStateException("Unsupported operating system");
            }
        }
        throw new IllegalStateException("Exception caught when determining operating system");
    }

    long b(String string, long l2) {
        if ((string = p.a(string, false)).length() > 0 && string.charAt(0) != '\"') {
            string = "\"" + string + "\"";
        }
        String[] arrstring = new String[]{"cmd.exe", "/C", "dir /a /-c " + string};
        List list = this.a(arrstring, Integer.MAX_VALUE, l2);
        for (int i2 = list.size() - 1; i2 >= 0; --i2) {
            String string2 = (String)list.get(i2);
            if (string2.length() <= 0) continue;
            return this.a(string2, string);
        }
        throw new IOException("Command line 'dir /-c' did not return any info for path '" + string + "'");
    }

    long a(String string, String string2) {
        char c2;
        int n2;
        int n3 = 0;
        int n4 = 0;
        for (n2 = string.length() - 1; n2 >= 0; --n2) {
            c2 = string.charAt(n2);
            if (!Character.isDigit(c2)) continue;
            n4 = n2 + 1;
            break;
        }
        while (n2 >= 0) {
            c2 = string.charAt(n2);
            if (!Character.isDigit(c2) && c2 != ',' && c2 != '.') {
                n3 = n2 + 1;
                break;
            }
            --n2;
        }
        if (n2 < 0) {
            throw new IOException("Command line 'dir /-c' did not return valid info for path '" + string2 + "'");
        }
        StringBuilder stringBuilder = new StringBuilder(string.substring(n3, n4));
        for (int i2 = 0; i2 < stringBuilder.length(); ++i2) {
            if (stringBuilder.charAt(i2) != ',' && stringBuilder.charAt(i2) != '.') continue;
            stringBuilder.deleteCharAt(i2--);
        }
        return this.b(stringBuilder.toString(), string2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    long a(String string, boolean bl2, boolean bl3, long l2) {
        String string2;
        String[] arrstring;
        if (string.length() == 0) {
            throw new IllegalArgumentException("Path must not be empty");
        }
        String string3 = "-";
        if (bl2) {
            string3 = string3 + "k";
        }
        if (bl3) {
            string3 = string3 + "P";
        }
        if (string3.length() > 1) {
            String[] arrstring2 = new String[3];
            arrstring2[0] = h;
            arrstring2[1] = string3;
            arrstring = arrstring2;
            arrstring2[2] = string;
        } else {
            String[] arrstring3 = new String[2];
            arrstring3[0] = h;
            arrstring = arrstring3;
            arrstring3[1] = string;
        }
        String[] arrstring4 = arrstring;
        List list = this.a(arrstring4, 3, l2);
        if (list.size() < 2) {
            throw new IOException("Command line '" + h + "' did not return info as expected " + "for path '" + string + "'- response was " + list);
        }
        String string4 = (String)list.get(1);
        StringTokenizer stringTokenizer = new StringTokenizer(string4, " ");
        if (stringTokenizer.countTokens() < 4) {
            if (stringTokenizer.countTokens() != 1 || list.size() < 3) throw new IOException("Command line '" + h + "' did not return data as expected " + "for path '" + string + "'- check path is valid");
            string2 = (String)list.get(2);
            stringTokenizer = new StringTokenizer(string2, " ");
        } else {
            stringTokenizer.nextToken();
        }
        stringTokenizer.nextToken();
        stringTokenizer.nextToken();
        string2 = stringTokenizer.nextToken();
        return this.b(string2, string);
    }

    long b(String string, String string2) {
        try {
            long l2 = Long.parseLong(string);
            if (l2 < 0L) {
                throw new IOException("Command line '" + h + "' did not find free space in response " + "for path '" + string2 + "'- check path is valid");
            }
            return l2;
        }
        catch (NumberFormatException numberFormatException) {
            throw new s("Command line '" + h + "' did not return numeric data as expected " + "for path '" + string2 + "'- check path is valid", numberFormatException);
        }
    }

    List a(String[] arrstring, int n2, long l2) {
        ArrayList<String> arrayList;
        ArrayList<String> arrayList2 = new ArrayList<String>(20);
        Process process = null;
        InputStream inputStream = null;
        OutputStream outputStream = null;
        InputStream inputStream2 = null;
        BufferedReader bufferedReader = null;
        try {
            Thread thread = w.a(l2);
            process = this.a(arrstring);
            inputStream = process.getInputStream();
            outputStream = process.getOutputStream();
            inputStream2 = process.getErrorStream();
            bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            String string = bufferedReader.readLine();
            while (string != null && arrayList2.size() < n2) {
                string = string.toLowerCase(Locale.ENGLISH).trim();
                arrayList2.add(string);
                string = bufferedReader.readLine();
            }
            process.waitFor();
            w.a(thread);
            if (process.exitValue() != 0) {
                throw new IOException("Command line returned OS error code '" + process.exitValue() + "' for command " + Arrays.asList(arrstring));
            }
            if (arrayList2.isEmpty()) {
                throw new IOException("Command line did not return any info for command " + Arrays.asList(arrstring));
            }
            arrayList = arrayList2;
        }
        catch (InterruptedException interruptedException) {
            try {
                throw new s("Command line threw an InterruptedException for command " + Arrays.asList(arrstring) + " timeout=" + l2, interruptedException);
            }
            catch (Throwable throwable) {
                t.a(inputStream);
                t.a(outputStream);
                t.a(inputStream2);
                t.a(bufferedReader);
                if (process != null) {
                    process.destroy();
                }
                throw throwable;
            }
        }
        t.a(inputStream);
        t.a(outputStream);
        t.a(inputStream2);
        t.a(bufferedReader);
        if (process != null) {
            process.destroy();
        }
        return arrayList;
    }

    Process a(String[] arrstring) {
        return Runtime.getRuntime().exec(arrstring);
    }

    static {
        int n2 = 0;
        String string = "df";
        try {
            String string2 = System.getProperty("os.name");
            if (string2 == null) {
                throw new IOException("os.name not found");
            }
            if ((string2 = string2.toLowerCase(Locale.ENGLISH)).indexOf("windows") != -1) {
                n2 = 1;
            } else if (string2.indexOf("linux") != -1 || string2.indexOf("mpe/ix") != -1 || string2.indexOf("freebsd") != -1 || string2.indexOf("irix") != -1 || string2.indexOf("digital unix") != -1 || string2.indexOf("unix") != -1 || string2.indexOf("mac os x") != -1) {
                n2 = 2;
            } else if (string2.indexOf("sun os") != -1 || string2.indexOf("sunos") != -1 || string2.indexOf("solaris") != -1) {
                n2 = 3;
                string = "/usr/xpg4/bin/df";
            } else {
                n2 = string2.indexOf("hp-ux") != -1 || string2.indexOf("aix") != -1 ? 3 : 0;
            }
        }
        catch (Exception exception) {
            n2 = -1;
        }
        g = n2;
        h = string;
    }
}

