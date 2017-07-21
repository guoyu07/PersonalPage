package cn.zhengzhaoyu.personalPage.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseWord<M extends BaseWord<M>> extends Model<M> implements IBean {

	public M setId(java.lang.Integer id) {
		set("id", id);
		return (M)this;
	}

	public java.lang.Integer getId() {
		return get("id");
	}

	public M setWordName(java.lang.String wordName) {
		set("word_name", wordName);
		return (M)this;
	}

	public java.lang.String getWordName() {
		return get("word_name");
	}

	public M setWordText(java.lang.String wordText) {
		set("word_text", wordText);
		return (M)this;
	}

	public java.lang.String getWordText() {
		return get("word_text");
	}

	public M setWordTime(java.util.Date wordTime) {
		set("word_time", wordTime);
		return (M)this;
	}

	public java.util.Date getWordTime() {
		return get("word_time");
	}

}
