package Alg;

public class BST {
	static TreeNode root=new TreeNode(88);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BST b=new BST();
		TreeNode t=new TreeNode(60);
		b.insert(t);
		TreeNode t1=new TreeNode(100);
		b.insert(t1);
		TreeNode t2=new TreeNode(40);
		b.insert(t2);
		TreeNode t3=new TreeNode(77);
		b.insert(t3);
		TreeNode t4=new TreeNode(95);
		b.insert(t4);
		TreeNode t5=new TreeNode(150);
		b.insert(t5);
		TreeNode t6=new TreeNode(50);
		b.insert(t6);
		TreeNode t7=new TreeNode(90);
		b.insert(t7);
		TreeNode t8=new TreeNode(96);
		b.insert(t8);
		TreeNode t9=new TreeNode(120);
		b.insert(t9);
		TreeNode t11=new TreeNode(160);
		b.insert(t11);
		TreeNode t22=new TreeNode(45);
		b.insert(t22);
		TreeNode t33=new TreeNode(55);
		b.insert(t33);
		TreeNode t44=new TreeNode(110);
		b.insert(t44);
		TreeNode t55=new TreeNode(53);
		b.insert(t55);
		
		System.out.println("\ninorder:");
		b.inorder(root);
		System.out.println("\npreorder:");
		b.preorder(root);
		System.out.println("\npostorder:");
		b.postorder(root);
		System.out.println("\ndelete: t2: "+t2.val);
		b.delete(t2);
		b.inorder(root);
		

	}
	
	
	public boolean insert(TreeNode t){
		TreeNode parent=root;
		while(true){
			if(t.val>parent.val){
				if(parent.right==null){
					System.out.println("parent: "+parent.val+", right child: "+t.val);
					parent.right=t;
					return true;
				}else{
					parent=parent.right;
				}
			}else if(t.val<parent.val){
				if(parent.left==null){
					System.out.println("parent: "+parent.val+", left child: "+t.val);
					parent.left=t;
					return true;
				}else{
					parent=parent.left;
				}
			}else{
				return false;
			}
		}
	}
	
	
	public void preorder(TreeNode t){
		if(t!=null){
			System.out.print(t.val+", ");
		}
		if(t.left!=null){
			preorder(t.left);
		}
		if(t.right!=null){
			preorder(t.right);
		}
	}
	
	public void inorder(TreeNode t){
		
		if(t.left!=null){
			inorder(t.left);
		}
		if(t!=null){
			System.out.print(t.val+", ");
		}
		if(t.right!=null){
			inorder(t.right);
		}
	}
	
	public void postorder(TreeNode t){
		
		if(t.left!=null){
			postorder(t.left);
		}
		
		if(t.right!=null){
			postorder(t.right);
		}
		
		if(t!=null){
			System.out.print(t.val+", ");
		}
	}
	
	@SuppressWarnings("null")
	public boolean delete(TreeNode t){
		TreeNode parent=root;
		TreeNode current=root;
		while(current!=null){
			if(current.val==t.val){
				break;
			}else if(current.val>t.val){
				parent=current;
				current=current.left;
			}else{
				parent=current;
				current=current.right;
			}
		}
		if(current==null){
			return false;
		}
		if(current.left!=null){
			TreeNode parentOfRightMost=current.left;
			TreeNode rightMost=parentOfRightMost.right;
			while(rightMost!=null){
				parentOfRightMost=rightMost;
				rightMost=rightMost.right;
			}
			current.val=rightMost.val;
			if(parentOfRightMost.right==rightMost){
				parentOfRightMost.right=rightMost.left;
			}else{
				parentOfRightMost.left=rightMost.left;
			}
		}else{
			if(parent==null){
				root=current.right;
			}else{
				if(t.val<parent.val){
					parent.left=current.right;
				}else{
					parent.right=current.right;
				}
			}
		}
		
		return true;
	}
}

 class TreeNode{
	public int val;
	public TreeNode left;
	public TreeNode right;

	public TreeNode(int n){
		val=n;
		left=null;
		right=null;
	}
}