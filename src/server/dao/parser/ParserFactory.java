package server.dao.parser;

import server.dao.parser.description.XMLStudentInfoParser;
import server.dao.parser.description.XMLUserParser;
import server.dao.parser.impl.XMLStudentInfoParserImpl;
import server.dao.parser.impl.XMLUserParserImpl;

public class ParserFactory {

    private final XMLUserParser userParser=new XMLUserParserImpl();
    private final XMLStudentInfoParser studentInfoParser=new XMLStudentInfoParserImpl();

    public XMLUserParser getUserParser() {
        return userParser;
    }

    public XMLStudentInfoParser getStudentInfoParser() {
        return studentInfoParser;
    }

    public ParserFactory() {
    }

    public static ParserFactory getInstance() {
        return Holder.INSTANCE;
    }

    private static class Holder {
        static final ParserFactory INSTANCE = new ParserFactory();
    }
}
