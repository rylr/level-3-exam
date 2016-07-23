import java.util.ArrayList;

public class VoteProcessor {
	public String calculateElectionWinner(ArrayList<String> entry) {
		int popeVote = 0;
		int edVote = 0;
		
		for(String vote : entry) {
			vote = vote.toLowerCase();
			
			if(vote.equals("pope francis"))
				popeVote++;
			else if(vote.equals("edward snowden"))
				edVote++;
		}
		
		if(popeVote > edVote)
			return "pope francis";
		else if(edVote > popeVote)
			return "edward snowden";
		else if(popeVote == edVote)
			return "TIE";
				
		return "blah";
	}
}
