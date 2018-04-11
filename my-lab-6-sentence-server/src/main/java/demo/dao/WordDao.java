package demo.dao;

import demo.domain.Word;


public interface WordDao {

	static final String SUBJECT = "MY-LAB-6-SUBJECT";
	static final String VERB = "MY-LAB-6-VERB";
	static final String ARTICLE = "MY-LAB-6-ARTICLE";
	static final String ADJECTIVE = "MY-LAB-6-ADJECTIVE";
	static final String NOUN = "MY-LAB-6-NOUN";
	
	Word getWord();
	
}
