package br.edu.doc.analisador.util;


public class Meta {

	private Vector vector;
	
	private QuestionType type;
	
	private QuestionTopic topic;

	private float[] questionTypeProbabilities = new float[QuestionType.values().length];

	private float[] questionTopicProbabilities = new float[QuestionTopic.values().length];
	
	private InterrogativeParticle interrogativeParticle;
	
	private String vocative;
	
	private Expression[] expressions;

	public Vector getVector() {
		return vector;
	}

	public void setVector(Vector vector) {
		this.vector = vector;
	}

	public QuestionType getType() {
		return type;
	}

	public void setType(QuestionType type) {
		this.type = type;
	}

	public QuestionTopic getTopic() {
		return topic;
	}

	public void setTopic(QuestionTopic topic) {
		this.topic = topic;
	}

	public String getVocative() {
		return vocative;
	}

	public void setVocative(String vocative) {
		this.vocative = vocative;
	}

	public Expression[] getExpressions() {
		return expressions;
	}

	public void setExpressions(Expression[] expressions) {
		this.expressions = expressions;
	}

	public InterrogativeParticle getInterrogativeParticle() {
		return interrogativeParticle;
	}

	public void setInterrogativeParticle(InterrogativeParticle interrogativeParticle) {
		this.interrogativeParticle = interrogativeParticle;
	}

	public float[] getQuestionTypeProbabilities() {
		return questionTypeProbabilities;
	}

	public void setQuestionTypeProbabilities(float[] questionTypeProbabilities) {
		this.questionTypeProbabilities = questionTypeProbabilities;
	}

	public float[] getQuestionTopicProbabilities() {
		return questionTopicProbabilities;
	}

	public void setQuestionTopicProbabilities(float[] questionTopicProbabilities) {
		this.questionTopicProbabilities = questionTopicProbabilities;
	}

	public boolean hasVocative() {
		return this.getVocative()!=null;
	}
}
