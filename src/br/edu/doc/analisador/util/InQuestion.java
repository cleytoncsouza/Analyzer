package br.edu.doc.analisador.util;

public class InQuestion {

	private String title;
	private String content;
	private String tags;

	public InQuestion() {
	}

	public InQuestion(String title, String content, String tags) {
		super();
		this.title = title;
		this.content = content;
		this.tags = tags;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}

	@Override
	public String toString() {
		return "Question [title =" + title + ", content =" + content
				+ ", tags =" + tags + "]";
	}
}
