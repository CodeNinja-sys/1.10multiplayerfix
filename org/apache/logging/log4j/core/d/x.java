/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.d;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.LineNumberReader;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

public class x {
    public static List a(Throwable throwable) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        try {
            throwable.printStackTrace(printWriter);
        }
        catch (RuntimeException runtimeException) {
            // empty catch block
        }
        printWriter.flush();
        LineNumberReader lineNumberReader = new LineNumberReader(new StringReader(stringWriter.toString()));
        ArrayList<String> arrayList = new ArrayList<String>();
        try {
            String string = lineNumberReader.readLine();
            while (string != null) {
                arrayList.add(string);
                string = lineNumberReader.readLine();
            }
        }
        catch (IOException iOException) {
            if (iOException instanceof InterruptedIOException) {
                Thread.currentThread().interrupt();
            }
            arrayList.add(iOException.toString());
        }
        return arrayList;
    }
}

