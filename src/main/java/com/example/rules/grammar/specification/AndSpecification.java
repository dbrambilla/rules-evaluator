package com.example.rules.grammar.specification;

import com.example.rules.IJsonPathParser;

public class AndSpecification extends CompositeSpecification {

        ISpecification leftSpecification;
        ISpecification rightSpecification;

        public AndSpecification(IJsonPathParser jsonPathParser, ISpecification left, ISpecification right)  {
                super(jsonPathParser);
                this.leftSpecification = left;
                this.rightSpecification = right;
        }

        public boolean isSatisfiedBy(String jsonData)   {
                return this.leftSpecification.isSatisfiedBy(jsonData) && this.rightSpecification.isSatisfiedBy(jsonData);
        }
}
