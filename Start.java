/* Generated By:JJTree: Do not edit this line. Start.java Version 7.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=false,NODE_PREFIX=,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
import org.graphstream.graph.implementations.MultiGraph;
public
class Start extends SimpleNode {
    public Start(int id) {
        super(id);
    }

    public Start(FAOPS p, int id) {
        super(p, id);
    }

    public void eval() {
        for (int i = 0; i < children.length; i++) {
            if (children[i] instanceof FA) {
                String variableName = ((FA) children[i]).name;
                MultiGraph fa = ((Stmt) children[++i]).eval();
                variables.put(variableName, fa);
            } else if (children[i] instanceof Dump) {
                ((Dump) children[i]).save();
            }
        }
    }
}
/* JavaCC - OriginalChecksum=77c583577783283e4ede46bdddb9f546 (do not edit this line) */
