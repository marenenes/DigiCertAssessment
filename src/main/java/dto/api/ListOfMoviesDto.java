package dto.api;

import java.io.Serializable;

public class ListOfMoviesDto  implements Serializable {
    private int count;
    private Object next;
    private Object previous;
    private ResultsDto[] results;

    public int getCount() { return count; }
    public void setCount(int value) { this.count = value; }

    public Object getNext() { return next; }
    public void setNext(Object value) { this.next = value; }

    public Object getPrevious() { return previous; }
    public void setPrevious(Object value) { this.previous = value; }

    public ResultsDto[] getResults() { return results; }
    public void setResults(ResultsDto[] value) { this.results = value; }
}
