package edu.isi.wings.workflow.template.classes.variables;

import edu.isi.wings.catalog.component.classes.requirements.ComponentRequirement;
import edu.isi.wings.workflow.template.api.Template;

public class ComponentVariable extends Variable {
	private static final long serialVersionUID = 1L;

	private boolean isConcrete;
	private Template template;
	private ComponentRequirement requirements;

	public ComponentVariable(String id) {
		super(id, VariableType.COMPONENT);
	}

	public ComponentVariable(Template t) {
		super(t.getID(), VariableType.COMPONENT);
		this.template = t;
	}

	public void setConcrete(boolean isConcrete) {
		this.isConcrete = isConcrete;
	}

	public boolean isConcrete() {
		return this.isConcrete;
		// return (binding != null)
	}

	public Template getTemplate() {
		return this.template;
	}

	public boolean isTemplate() {
		return (this.template != null);
	}

  public ComponentRequirement getRequirements() {
    return requirements;
  }

  public void setRequirements(ComponentRequirement requirements) {
    this.requirements = requirements;
  }
}