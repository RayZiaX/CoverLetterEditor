package ccl.Graphics.Components;

import java.util.ArrayList;
import java.util.Arrays;
import java.awt.Dimension;
import java.io.File;

import javax.swing.JTextPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

import ccl.Graphics.Events.EventMouseClickJTree;

public class MJTree extends JTree{
    public static DefaultMutableTreeNode _root = new DefaultMutableTreeNode("Cover letter");;
    private ArrayList<DefaultMutableTreeNode> _firstRankNodes;
    private ArrayList<DefaultMutableTreeNode> _SecondRanckNodes;
    public ArrayList<String> _templateName;

    // public MJTree(String root,String[] firstRankNodes,Dimension dim){
    //     this._root = new DefaultMutableTreeNode(root);
    //     this.setPreferredSize(dim);
    //     ArrayList<String> arrString = new ArrayList<String>(Arrays.asList(firstRankNodes));  
    //     DefaultMutableTreeNode[] firstRankNodesArrayList = new DefaultMutableTreeNode[arrString.size() + 1];
    //     for (int i = 0; i < arrString.size(); i++) {
    //         firstRankNodesArrayList[i] = new DefaultMutableTreeNode(arrString.get(i));
    //     }
    //     this._firstRankNodes = new ArrayList<DefaultMutableTreeNode>(Arrays.asList(firstRankNodesArrayList));
    //     addChildrenIntoParent(this._root,this._firstRankNodes);
    // }

    public MJTree(Dimension dim,JTextPane textArea){
        super(_root);
        this._firstRankNodes = new ArrayList<DefaultMutableTreeNode>();
        this.setPreferredSize(dim);
        pickListTemplate();
        this.addMouseListener(new EventMouseClickJTree(this,textArea));
    }

    private void pickListTemplate(){
        File file = null;
        String[] paths;
        try {
            file = new File("./src/main/java/ccl/template");
            paths = file.list();
            this._templateName = new ArrayList<String>(Arrays.asList(paths));
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void addCategory(String categoryName){
        this._firstRankNodes.add(new DefaultMutableTreeNode(categoryName));
    }


    public void addFileName(int index){
        DefaultMutableTreeNode parentCat = this.getOneFirstRankTreeNode(index);
        for (int i = 0; i < this._templateName.size(); i++) {
            DefaultMutableTreeNode childFile = new DefaultMutableTreeNode(this._templateName.get(i));
            parentCat.add(childFile);
        }
    }


    public void addChildrenIntoParent(DefaultMutableTreeNode parent,ArrayList<DefaultMutableTreeNode> children){
        for (int i = 0; i < children.size(); i++) {
            parent.add(children.get(i));
        }
    }
    public void addChildrenIntoParent(DefaultMutableTreeNode parent,DefaultMutableTreeNode[] children){
        for (int i = 0; i < children.length; i++) {
            parent.add(children[i]);
        }
    }

    public void addChildIntoParent(DefaultMutableTreeNode parent,DefaultMutableTreeNode child){
        parent.add(child);
    }

    // public ArrayList<DefaultMutableTreeNode> getAllFirstRankTreeNode(){
    //     return this._firstRankNodes;
    // }
    public DefaultMutableTreeNode getOneFirstRankTreeNode(int index){
        return this._firstRankNodes.get(index);
    }
    // public DefaultMutableTreeNode getOneSecondRankTreeNode(int index){
    //     return this._SecondRanckNodes.get(index);
    // }
}
